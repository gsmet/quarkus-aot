package fr.spacefox.perftests.quarkus.core.service860;

import fr.spacefox.perftests.quarkus.core.port.data.Entity860DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service860.model.Model860;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service860 {

    private final Entity860DatasourcePort datasource;

    public Service860(Entity860DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model860 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
