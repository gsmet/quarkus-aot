package fr.spacefox.perftests.quarkus.core.service984;

import fr.spacefox.perftests.quarkus.core.port.data.Entity984DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service984.model.Model984;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service984 {

    private final Entity984DatasourcePort datasource;

    public Service984(Entity984DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model984 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
