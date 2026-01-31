package fr.spacefox.perftests.quarkus.core.service165;

import fr.spacefox.perftests.quarkus.core.port.data.Entity165DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service165.model.Model165;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service165 {

    private final Entity165DatasourcePort datasource;

    public Service165(Entity165DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model165 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
