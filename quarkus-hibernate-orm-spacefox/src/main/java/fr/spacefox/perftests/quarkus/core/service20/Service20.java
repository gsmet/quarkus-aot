package fr.spacefox.perftests.quarkus.core.service20;

import fr.spacefox.perftests.quarkus.core.port.data.Entity20DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service20.model.Model20;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service20 {

    private final Entity20DatasourcePort datasource;

    public Service20(Entity20DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model20 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
