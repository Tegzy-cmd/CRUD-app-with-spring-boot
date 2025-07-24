package com.codewithtegzy.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")

public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        "JS, JAVA, PYTHON"

                ),
        new SoftwareEngineer(
                2,
                "Jamila",
                "JS, PHP, PYTHON"

        ),
        new SoftwareEngineer(
                3,
                "Grace",
                "JS, Svetle, Express"

        ),
                new SoftwareEngineer(
                        4,
                        "Ruth",
                        "JS, Groovy, Node"

                )


        );
    }
}
