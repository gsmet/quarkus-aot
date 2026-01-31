package fr.spacefox.perftests.quarkus.core.service953;

import fr.spacefox.perftests.quarkus.core.port.data.Entity953DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service953.model.Model953;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service953 {

    private final Entity953DatasourcePort datasource;

    public Service953(Entity953DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model953 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
