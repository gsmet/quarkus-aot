package fr.spacefox.perftests.quarkus.core.service264;

import fr.spacefox.perftests.quarkus.core.port.data.Entity264DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service264.model.Model264;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service264 {

    private final Entity264DatasourcePort datasource;

    public Service264(Entity264DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model264 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
