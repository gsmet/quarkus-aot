package fr.spacefox.perftests.quarkus.core.service867;

import fr.spacefox.perftests.quarkus.core.port.data.Entity867DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service867.model.Model867;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service867 {

    private final Entity867DatasourcePort datasource;

    public Service867(Entity867DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model867 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
