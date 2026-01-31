package fr.spacefox.perftests.quarkus.core.service216;

import fr.spacefox.perftests.quarkus.core.port.data.Entity216DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service216.model.Model216;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service216 {

    private final Entity216DatasourcePort datasource;

    public Service216(Entity216DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model216 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
