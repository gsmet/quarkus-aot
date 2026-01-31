package fr.spacefox.perftests.quarkus.core.service938;

import fr.spacefox.perftests.quarkus.core.port.data.Entity938DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service938.model.Model938;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service938 {

    private final Entity938DatasourcePort datasource;

    public Service938(Entity938DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model938 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
