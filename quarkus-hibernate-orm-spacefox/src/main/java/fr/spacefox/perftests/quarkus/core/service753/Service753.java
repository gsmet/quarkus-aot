package fr.spacefox.perftests.quarkus.core.service753;

import fr.spacefox.perftests.quarkus.core.port.data.Entity753DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service753.model.Model753;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service753 {

    private final Entity753DatasourcePort datasource;

    public Service753(Entity753DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model753 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
