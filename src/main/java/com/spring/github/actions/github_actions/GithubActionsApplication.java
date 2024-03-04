package com.spring.github.actions.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to the GIT HUB Actions CI CD";
    }
    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }

//    echo "# GITHUB_ACTIONS_CICD-EXAMPLE" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M Master
//    git remote add origin https://github.com/rajasekharakokku/GITHUB_ACTIONS_CICD-EXAMPLE.git
//    git push -u origin Master


}
