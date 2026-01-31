package fr.spacefox.perftests.quarkus.core.service565;

import fr.spacefox.perftests.quarkus.core.port.data.Entity565DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service565.model.Model565;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service565 {

    private final Entity565DatasourcePort datasource;

    public Service565(Entity565DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model565 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
