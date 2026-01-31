package fr.spacefox.perftests.quarkus.core.service114;

import fr.spacefox.perftests.quarkus.core.port.data.Entity114DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service114.model.Model114;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service114 {

    private final Entity114DatasourcePort datasource;

    public Service114(Entity114DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model114 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
