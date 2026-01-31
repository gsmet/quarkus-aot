package fr.spacefox.perftests.quarkus.core.service687;

import fr.spacefox.perftests.quarkus.core.port.data.Entity687DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service687.model.Model687;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service687 {

    private final Entity687DatasourcePort datasource;

    public Service687(Entity687DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model687 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
