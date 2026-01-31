package fr.spacefox.perftests.quarkus.core.service294;

import fr.spacefox.perftests.quarkus.core.port.data.Entity294DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service294.model.Model294;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service294 {

    private final Entity294DatasourcePort datasource;

    public Service294(Entity294DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model294 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
