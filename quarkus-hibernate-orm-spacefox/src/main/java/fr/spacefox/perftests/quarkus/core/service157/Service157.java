package fr.spacefox.perftests.quarkus.core.service157;

import fr.spacefox.perftests.quarkus.core.port.data.Entity157DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service157.model.Model157;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service157 {

    private final Entity157DatasourcePort datasource;

    public Service157(Entity157DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model157 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
