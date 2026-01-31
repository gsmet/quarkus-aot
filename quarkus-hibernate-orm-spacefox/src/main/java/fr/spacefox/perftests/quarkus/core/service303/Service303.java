package fr.spacefox.perftests.quarkus.core.service303;

import fr.spacefox.perftests.quarkus.core.port.data.Entity303DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service303.model.Model303;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service303 {

    private final Entity303DatasourcePort datasource;

    public Service303(Entity303DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model303 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
