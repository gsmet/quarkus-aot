package fr.spacefox.perftests.quarkus.core.service944;

import fr.spacefox.perftests.quarkus.core.port.data.Entity944DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service944.model.Model944;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service944 {

    private final Entity944DatasourcePort datasource;

    public Service944(Entity944DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model944 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
