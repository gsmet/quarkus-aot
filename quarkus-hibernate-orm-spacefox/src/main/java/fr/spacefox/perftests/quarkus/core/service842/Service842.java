package fr.spacefox.perftests.quarkus.core.service842;

import fr.spacefox.perftests.quarkus.core.port.data.Entity842DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service842.model.Model842;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service842 {

    private final Entity842DatasourcePort datasource;

    public Service842(Entity842DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model842 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
