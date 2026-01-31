package fr.spacefox.perftests.quarkus.core.service810;

import fr.spacefox.perftests.quarkus.core.port.data.Entity810DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service810.model.Model810;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service810 {

    private final Entity810DatasourcePort datasource;

    public Service810(Entity810DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model810 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
