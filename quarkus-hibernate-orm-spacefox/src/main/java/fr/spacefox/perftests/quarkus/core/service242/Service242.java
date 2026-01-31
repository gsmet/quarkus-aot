package fr.spacefox.perftests.quarkus.core.service242;

import fr.spacefox.perftests.quarkus.core.port.data.Entity242DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service242.model.Model242;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service242 {

    private final Entity242DatasourcePort datasource;

    public Service242(Entity242DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model242 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
