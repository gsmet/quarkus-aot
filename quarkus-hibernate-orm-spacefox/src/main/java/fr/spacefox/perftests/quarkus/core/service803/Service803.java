package fr.spacefox.perftests.quarkus.core.service803;

import fr.spacefox.perftests.quarkus.core.port.data.Entity803DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service803.model.Model803;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service803 {

    private final Entity803DatasourcePort datasource;

    public Service803(Entity803DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model803 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
