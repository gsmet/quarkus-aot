package fr.spacefox.perftests.quarkus.core.service278;

import fr.spacefox.perftests.quarkus.core.port.data.Entity278DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service278.model.Model278;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service278 {

    private final Entity278DatasourcePort datasource;

    public Service278(Entity278DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model278 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
