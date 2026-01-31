package fr.spacefox.perftests.quarkus.core.service50;

import fr.spacefox.perftests.quarkus.core.port.data.Entity50DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service50.model.Model50;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service50 {

    private final Entity50DatasourcePort datasource;

    public Service50(Entity50DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model50 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
