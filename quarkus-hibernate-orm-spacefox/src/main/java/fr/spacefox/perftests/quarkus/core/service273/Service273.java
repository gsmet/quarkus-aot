package fr.spacefox.perftests.quarkus.core.service273;

import fr.spacefox.perftests.quarkus.core.port.data.Entity273DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service273.model.Model273;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service273 {

    private final Entity273DatasourcePort datasource;

    public Service273(Entity273DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model273 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
