package fr.spacefox.perftests.quarkus.core.service828;

import fr.spacefox.perftests.quarkus.core.port.data.Entity828DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service828.model.Model828;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service828 {

    private final Entity828DatasourcePort datasource;

    public Service828(Entity828DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model828 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
