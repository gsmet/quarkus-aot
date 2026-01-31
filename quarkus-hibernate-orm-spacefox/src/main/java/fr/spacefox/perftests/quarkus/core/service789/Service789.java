package fr.spacefox.perftests.quarkus.core.service789;

import fr.spacefox.perftests.quarkus.core.port.data.Entity789DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service789.model.Model789;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service789 {

    private final Entity789DatasourcePort datasource;

    public Service789(Entity789DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model789 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
