package fr.spacefox.perftests.quarkus.core.service859;

import fr.spacefox.perftests.quarkus.core.port.data.Entity859DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service859.model.Model859;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service859 {

    private final Entity859DatasourcePort datasource;

    public Service859(Entity859DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model859 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
