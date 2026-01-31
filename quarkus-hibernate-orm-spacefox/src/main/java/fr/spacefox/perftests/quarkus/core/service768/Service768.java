package fr.spacefox.perftests.quarkus.core.service768;

import fr.spacefox.perftests.quarkus.core.port.data.Entity768DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service768.model.Model768;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service768 {

    private final Entity768DatasourcePort datasource;

    public Service768(Entity768DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model768 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
