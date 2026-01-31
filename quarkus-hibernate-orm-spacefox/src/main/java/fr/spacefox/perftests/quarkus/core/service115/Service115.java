package fr.spacefox.perftests.quarkus.core.service115;

import fr.spacefox.perftests.quarkus.core.port.data.Entity115DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service115.model.Model115;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service115 {

    private final Entity115DatasourcePort datasource;

    public Service115(Entity115DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model115 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
