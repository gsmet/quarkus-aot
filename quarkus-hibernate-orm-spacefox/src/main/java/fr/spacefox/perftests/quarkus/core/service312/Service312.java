package fr.spacefox.perftests.quarkus.core.service312;

import fr.spacefox.perftests.quarkus.core.port.data.Entity312DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service312.model.Model312;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service312 {

    private final Entity312DatasourcePort datasource;

    public Service312(Entity312DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model312 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
