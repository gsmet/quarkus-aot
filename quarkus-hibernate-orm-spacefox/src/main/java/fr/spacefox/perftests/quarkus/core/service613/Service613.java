package fr.spacefox.perftests.quarkus.core.service613;

import fr.spacefox.perftests.quarkus.core.port.data.Entity613DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service613.model.Model613;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service613 {

    private final Entity613DatasourcePort datasource;

    public Service613(Entity613DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model613 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
