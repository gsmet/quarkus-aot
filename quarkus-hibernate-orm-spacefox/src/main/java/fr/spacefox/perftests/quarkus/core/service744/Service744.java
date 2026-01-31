package fr.spacefox.perftests.quarkus.core.service744;

import fr.spacefox.perftests.quarkus.core.port.data.Entity744DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service744.model.Model744;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service744 {

    private final Entity744DatasourcePort datasource;

    public Service744(Entity744DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model744 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
