package fr.spacefox.perftests.quarkus.core.service359;

import fr.spacefox.perftests.quarkus.core.port.data.Entity359DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service359.model.Model359;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service359 {

    private final Entity359DatasourcePort datasource;

    public Service359(Entity359DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model359 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
