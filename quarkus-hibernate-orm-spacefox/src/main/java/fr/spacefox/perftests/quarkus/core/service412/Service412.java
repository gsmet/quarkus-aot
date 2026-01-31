package fr.spacefox.perftests.quarkus.core.service412;

import fr.spacefox.perftests.quarkus.core.port.data.Entity412DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service412.model.Model412;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service412 {

    private final Entity412DatasourcePort datasource;

    public Service412(Entity412DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model412 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
