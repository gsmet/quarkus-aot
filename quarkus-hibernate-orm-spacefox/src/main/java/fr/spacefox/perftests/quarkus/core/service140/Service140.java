package fr.spacefox.perftests.quarkus.core.service140;

import fr.spacefox.perftests.quarkus.core.port.data.Entity140DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service140.model.Model140;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service140 {

    private final Entity140DatasourcePort datasource;

    public Service140(Entity140DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model140 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
