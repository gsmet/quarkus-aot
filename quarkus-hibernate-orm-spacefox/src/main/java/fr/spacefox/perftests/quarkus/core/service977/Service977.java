package fr.spacefox.perftests.quarkus.core.service977;

import fr.spacefox.perftests.quarkus.core.port.data.Entity977DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service977.model.Model977;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service977 {

    private final Entity977DatasourcePort datasource;

    public Service977(Entity977DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model977 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
