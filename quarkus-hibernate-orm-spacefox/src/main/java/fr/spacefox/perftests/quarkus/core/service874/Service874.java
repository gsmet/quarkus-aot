package fr.spacefox.perftests.quarkus.core.service874;

import fr.spacefox.perftests.quarkus.core.port.data.Entity874DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service874.model.Model874;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service874 {

    private final Entity874DatasourcePort datasource;

    public Service874(Entity874DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model874 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
