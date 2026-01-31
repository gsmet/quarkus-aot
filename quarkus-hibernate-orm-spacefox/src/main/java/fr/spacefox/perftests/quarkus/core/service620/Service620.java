package fr.spacefox.perftests.quarkus.core.service620;

import fr.spacefox.perftests.quarkus.core.port.data.Entity620DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service620.model.Model620;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service620 {

    private final Entity620DatasourcePort datasource;

    public Service620(Entity620DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model620 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
