package fr.spacefox.perftests.quarkus.core.service927;

import fr.spacefox.perftests.quarkus.core.port.data.Entity927DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service927.model.Model927;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service927 {

    private final Entity927DatasourcePort datasource;

    public Service927(Entity927DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model927 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
