package fr.spacefox.perftests.quarkus.core.service410;

import fr.spacefox.perftests.quarkus.core.port.data.Entity410DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service410.model.Model410;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service410 {

    private final Entity410DatasourcePort datasource;

    public Service410(Entity410DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model410 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
