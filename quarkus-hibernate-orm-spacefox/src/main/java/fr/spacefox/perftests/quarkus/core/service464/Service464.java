package fr.spacefox.perftests.quarkus.core.service464;

import fr.spacefox.perftests.quarkus.core.port.data.Entity464DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service464.model.Model464;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service464 {

    private final Entity464DatasourcePort datasource;

    public Service464(Entity464DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model464 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
