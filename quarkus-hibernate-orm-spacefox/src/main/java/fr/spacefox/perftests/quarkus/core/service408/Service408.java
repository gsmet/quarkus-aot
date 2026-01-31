package fr.spacefox.perftests.quarkus.core.service408;

import fr.spacefox.perftests.quarkus.core.port.data.Entity408DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service408.model.Model408;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service408 {

    private final Entity408DatasourcePort datasource;

    public Service408(Entity408DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model408 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
