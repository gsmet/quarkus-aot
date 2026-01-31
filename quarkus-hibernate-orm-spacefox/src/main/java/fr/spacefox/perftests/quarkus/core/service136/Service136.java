package fr.spacefox.perftests.quarkus.core.service136;

import fr.spacefox.perftests.quarkus.core.port.data.Entity136DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service136.model.Model136;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service136 {

    private final Entity136DatasourcePort datasource;

    public Service136(Entity136DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model136 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
