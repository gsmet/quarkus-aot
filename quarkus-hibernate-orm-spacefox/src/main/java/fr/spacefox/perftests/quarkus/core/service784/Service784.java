package fr.spacefox.perftests.quarkus.core.service784;

import fr.spacefox.perftests.quarkus.core.port.data.Entity784DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service784.model.Model784;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service784 {

    private final Entity784DatasourcePort datasource;

    public Service784(Entity784DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model784 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
