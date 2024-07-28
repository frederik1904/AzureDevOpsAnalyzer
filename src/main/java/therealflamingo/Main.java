package therealflamingo;

import therealflamingo.ado.api.PullRequestsApi;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.auth.HttpBasicAuth;
import therealflamingo.config.IConfigLoader;
import therealflamingo.config.YamlConfigLoader;
import therealflamingo.config.models.Config;
import therealflamingo.secrets.ISecretProvider;
import therealflamingo.secrets.KeePassSecretProvider;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        IConfigLoader configLoader = new YamlConfigLoader();
        Config config = configLoader.load();
        ISecretProvider secretProvider = new KeePassSecretProvider(config);
        System.out.println(config);
        System.out.println(secretProvider.getSecretEntry(config.getAzureDevOps().getKeePassEntry()));

        var client = new ApiClient();
        client.setPassword(secretProvider.getSecretEntry(config.getAzureDevOps().getKeePassEntry()).password());
        client.setBasePath(config.getAzureDevOps().getBaseUrl());

        PullRequestsApi pullRequestsApi = new PullRequestsApi(client);
        var resp = pullRequestsApi.pullRequestsGetPullRequestById(config.getAzureDevOps().getOrganization(), 1, config.getAzureDevOps().getProject(), "7.2-preview.2");

        System.out.println(resp.toString());

    }
}