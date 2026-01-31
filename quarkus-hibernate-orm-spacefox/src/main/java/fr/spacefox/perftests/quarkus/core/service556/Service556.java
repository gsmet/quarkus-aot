package fr.spacefox.perftests.quarkus.core.service556;

import fr.spacefox.perftests.quarkus.core.port.data.Entity556DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service556.model.Model556;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service556 {

    private final Entity556DatasourcePort datasource;

    public Service556(Entity556DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model556 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
