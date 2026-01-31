package fr.spacefox.perftests.quarkus.core.service762;

import fr.spacefox.perftests.quarkus.core.port.data.Entity762DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service762.model.Model762;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service762 {

    private final Entity762DatasourcePort datasource;

    public Service762(Entity762DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model762 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
