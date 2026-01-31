package fr.spacefox.perftests.quarkus.core.service246;

import fr.spacefox.perftests.quarkus.core.port.data.Entity246DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service246.model.Model246;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service246 {

    private final Entity246DatasourcePort datasource;

    public Service246(Entity246DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model246 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
