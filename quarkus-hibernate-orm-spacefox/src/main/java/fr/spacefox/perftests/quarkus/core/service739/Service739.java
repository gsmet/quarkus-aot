package fr.spacefox.perftests.quarkus.core.service739;

import fr.spacefox.perftests.quarkus.core.port.data.Entity739DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service739.model.Model739;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service739 {

    private final Entity739DatasourcePort datasource;

    public Service739(Entity739DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model739 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
