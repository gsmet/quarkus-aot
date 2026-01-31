package fr.spacefox.perftests.quarkus.core.service73;

import fr.spacefox.perftests.quarkus.core.port.data.Entity73DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service73.model.Model73;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service73 {

    private final Entity73DatasourcePort datasource;

    public Service73(Entity73DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model73 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
