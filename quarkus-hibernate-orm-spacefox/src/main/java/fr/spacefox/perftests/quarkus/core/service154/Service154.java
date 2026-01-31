package fr.spacefox.perftests.quarkus.core.service154;

import fr.spacefox.perftests.quarkus.core.port.data.Entity154DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service154.model.Model154;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service154 {

    private final Entity154DatasourcePort datasource;

    public Service154(Entity154DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model154 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
