package fr.spacefox.perftests.quarkus.core.service660;

import fr.spacefox.perftests.quarkus.core.port.data.Entity660DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service660.model.Model660;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service660 {

    private final Entity660DatasourcePort datasource;

    public Service660(Entity660DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model660 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
