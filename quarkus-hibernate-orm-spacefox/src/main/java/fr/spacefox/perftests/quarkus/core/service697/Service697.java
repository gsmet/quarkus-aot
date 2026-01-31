package fr.spacefox.perftests.quarkus.core.service697;

import fr.spacefox.perftests.quarkus.core.port.data.Entity697DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service697.model.Model697;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service697 {

    private final Entity697DatasourcePort datasource;

    public Service697(Entity697DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model697 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
